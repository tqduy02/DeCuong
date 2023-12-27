package basic.dev;

import java.util.Scanner;
import java.util.Arrays;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * 1
		 */
//		System.out.print("Nhập số phần tử của mảng: ");
//		int n = scanner.nextInt();
//
//		// Khởi tạo mảng
//		int[] mang = new int[n];
//
//		// Nhập mảng
//		inMang(mang);
//
//		// Sắp xếp mảng tăng dần
//		sapXepTangDan(mang);
//		System.out.println("Mảng sau khi sắp xếp tăng dần:");
//		inMang(mang);
//
//		// Sắp xếp mảng giảm dần
//		sapXepGiamDan(mang);
//		System.out.println("Mảng sau khi sắp xếp giảm dần:");
//		inMang(mang);
//		System.out.println("Nhập các phần tử của mảng:");
//		for (int i = 0; i < mang.length; i++) {
//			System.out.print("Phần tử thứ " + (i + 1) + ": ");
//			mang[i] = scanner.nextInt();
//		}
//	}
//
//	// Hàm sắp xếp mảng tăng dần
//	public static void sapXepTangDan(int[] mang) {
//		Arrays.sort(mang);
//	}
//
//	// Hàm sắp xếp mảng giảm dần
//	public static void sapXepGiamDan(int[] mang) {
//		Arrays.sort(mang);
//		int n = mang.length;
//		for (int i = 0; i < n / 2; i++) {
//			int temp = mang[i];
//			mang[i] = mang[n - i - 1];
//			mang[n - i - 1] = temp;
//		}
//	}
//
//	// Hàm in mảng
//	public static void inMang(int[] mang) {
//		System.out.println("Mảng sau khi sắp xếp:");
//		for (int i = 0; i < mang.length; i++) {
//			System.out.print(mang[i] + " ");
//		}
//		System.out.println();
//	}
		
		/**
		 * 3
		 */
//		// Nhập giá trị n từ người dùng
//		System.out.print("Nhập giá trị n: ");
//		int n = scanner.nextInt();
//
//		// Tính tổng
//		double tong = tinhTong(n);
//
//		// Hiển thị kết quả
//		System.out.println("Tổng của dãy số là: " + tong);
//
//		// Đóng đối tượng Scanner sau khi sử dụng
//		scanner.close();
//	}
//
//	// Phương thức tính tổng theo công thức đã cho
//	public static double tinhTong(int n) {
//		double tong = 1.0;
//
//		for (int i = 2; i <= n; i++) {
//			tong += Math.pow(i, 2) / tinhGiaiThua(i);
//		}
//
//		return tong;
//	}
//
//	// Phương thức tính giai thừa
//	public static long tinhGiaiThua(int m) {
//		long giaiThua = 1;
//
//		for (int i = 1; i <= m; i++) {
//			giaiThua *= i;
//		}
//
//		return giaiThua;
//	}
		
		/**
		 * 4
		 */
//		System.out.print("Nhập số phần tử của mảng: ");
//		int n = scanner.nextInt();
//
//		// Khởi tạo mảng
//		int[] mang = new int[n];
//
//		// Nhập mảng
//		nhapMang(mang);
//
//		// Đếm số nguyên tố trong mảng
//		int soLuongSoNguyenTo = demSoNguyenTo(mang);
//		System.out.println("Số lượng số nguyên tố trong mảng: " + soLuongSoNguyenTo);
//
//	}
//
//	private static void nhapMang(int[] mang) {
//		System.out.println("Nhập các phần tử của mảng:");
//		for (int i = 0; i < mang.length; i++) {
//			System.out.print("Phần tử thứ " + (i + 1) + ": ");
//			mang[i] = scanner.nextInt();
//		
//	}
//
//	// Hàm kiểm tra số nguyên tố
//	public static boolean laSoNguyenTo(int n) {
//		if (n < 2) {
//			return false;
//		}
//		for (int i = 2; i <= Math.sqrt(n); i++) {
//			if (n % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	// Hàm đếm số nguyên tố trong mảng
//	public static int demSoNguyenTo(int[] mang) {
//		int dem = 0;
//		for (int i = 0; i < mang.length; i++) {
//			if (laSoNguyenTo(mang[i])) {
//				dem++;
//			}
//		}
//		return dem;
//	}

}
