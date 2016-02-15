package com.wanhang.fitness.common.util;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import javax.imageio.ImageIO;

import org.csource.fastdfs.Dfs;
import org.springframework.web.multipart.MultipartFile;

public class UploadUtil{

	public static String getSuffix(String filename) {
		if ((filename != null) && (filename.length() > 0)) {
			int dot = filename.lastIndexOf('.');
			if ((dot > -1) && (dot < (filename.length() - 1))) {
				return filename.substring(dot + 1);
			}
		}
		return filename;
	}
	
	public static String fastUpload(MultipartFile file, String fileName) {
		String filePath = null;
		if(file != null){
			String suffix = getSuffix(fileName);
			try{
				filePath = Dfs.upload(file.getBytes(), suffix);
			}catch(Exception e){
				e.printStackTrace();
				filePath = null;
			}
			
		}
		return filePath;
	}
	
	public static String abscut(byte[] file, int x, int y, int destWidth,
			int destHeight) {
		try {
			Image img;
			ImageFilter cropFilter;
			ByteArrayInputStream in = new ByteArrayInputStream(file);
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			// 读取源图像
			BufferedImage bi = ImageIO.read(in);
			int srcWidth = bi.getWidth(); // 源图宽度
			int srcHeight = bi.getHeight(); // 源图高度
			if (srcWidth >= destWidth && srcHeight >= destHeight) {
				Image image = bi.getScaledInstance(srcWidth, srcHeight,
						Image.SCALE_DEFAULT);
				// 改进的想法:是否可用多线程加快切割速度
				// 四个参数分别为图像起点坐标和宽高
				// 即: CropImageFilter(int x,int y,int width,int height)
				cropFilter = new CropImageFilter(x, y, destWidth, destHeight);
				img = Toolkit.getDefaultToolkit().createImage(
						new FilteredImageSource(image.getSource(), cropFilter));
				BufferedImage tag = new BufferedImage(destWidth, destHeight,
						BufferedImage.TYPE_INT_RGB);
				Graphics g = tag.getGraphics();
				g.drawImage(img, 0, 0, null); // 绘制缩小后的图
				g.dispose();
				// 输出为文件
				// if(!new File(dirImageFile).exists()){
				// new File(dirImageFile).mkdirs();
				// }
				ImageIO.write(tag, "jpg", out);
				in.close();
				file=out.toByteArray();
				out.close();
				return Dfs.upload(file, "jpg");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
