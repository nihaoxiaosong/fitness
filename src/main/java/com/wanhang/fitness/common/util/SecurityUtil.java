package com.wanhang.fitness.common.util;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * http://blog.csdn.net/hbcui1984/article/details/5201247
 * 淘宝加密后的长度是32位，这个加密后的长度是64位
 * 
 */
public class SecurityUtil {

	/**
	 * 加密
	 * 
	 * @param content
	 *            需要加密的内容
	 * @param password
	 *            加密密码
	 * @return
	 * @throws Exception
	 */
	public static String encrypt(String content, String password) throws Exception {
		SecretKey secretKey = getKey(password);
		byte[] enCodeFormat = secretKey.getEncoded();
		SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
		Cipher cipher = Cipher.getInstance("AES");// 创建密码器
		byte[] byteContent = content.getBytes("UTF-8");
		cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
		byte[] result = cipher.doFinal(byteContent);
		return parseByte2HexStr(result); // 加密
	}

	/**
	 * 加密
	 * 
	 * @param content
	 * @return
	 * @throws Exception
	 */
	public static String encrypt(String content) throws Exception {
		return encrypt(content, "FD3D8FA498E0A58D3B2C3BE810FD522654A0B86FE558DC53AFBCCE67EFFE9CB2");
	}

	/**
	 * 解密
	 * 
	 * @param content
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(String content) throws Exception {
		return decrypt(content, "FD3D8FA498E0A58D3B2C3BE810FD522654A0B86FE558DC53AFBCCE67EFFE9CB2");
	}

	/**
	 * 解密
	 * 
	 * @param content
	 *            待解密内容
	 * @param password
	 *            解密密钥
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(String content, String password) throws Exception {
		SecretKey secretKey = getKey(password);
		byte[] enCodeFormat = secretKey.getEncoded();
		SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
		Cipher cipher = Cipher.getInstance("AES");// 创建密码器
		cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
		byte[] result = cipher.doFinal(parseHexStr2Byte(content));
		return new String(result); // 加密
	}

	public static SecretKey getKey(String strKey) throws Exception {
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		// SecureRandom 实现完全随操作系统本身的内部状态，除非调用方在调用 getInstance 方法之后又调用了
		// setSeed 方法；该实现在 windows 上每次生成的 key 都相同，但是在 solaris 或部分 linux
		// 系统上则不同。
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		secureRandom.setSeed(strKey.getBytes());
		kgen.init(128, secureRandom);
		return kgen.generateKey();
	}

	/**
	 * 将二进制转换成16进制
	 * 
	 * @param buf
	 * @return
	 */
	public static String parseByte2HexStr(byte buf[]) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < buf.length; i++) {
			String hex = Integer.toHexString(buf[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			sb.append(hex.toUpperCase());
		}
		return sb.toString();
	}

	/**
	 * 将16进制转换为二进制
	 * 
	 * @param hexStr
	 * @return
	 */
	public static byte[] parseHexStr2Byte(String hexStr) {
		if (hexStr.length() < 1)
			return null;
		byte[] result = new byte[hexStr.length() / 2];
		for (int i = 0; i < hexStr.length() / 2; i++) {
			int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
			int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
			result[i] = (byte) (high * 16 + low);
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		long begin = System.currentTimeMillis();
		String content = "test中国 @ 45.[]=+-#`";
		String password = "12345678";
		// 加密
		System.out.println("加密前：" + content);
		String encryptResult = SecurityUtil.encrypt(content, password);
		System.out.println("加密后：" + encryptResult);
		System.out.println("加密后的长度：" + encryptResult.length());
		// 解密
		String decryptResult = SecurityUtil.decrypt(encryptResult, password);
		System.out.println("解密后：" + decryptResult);
		long end = System.currentTimeMillis();
		System.out.println("用时：" + (end - begin));
	}
}