package basic.dev;

import java.util.Scanner;

public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * 1
		 */
//		System.out.print("Nhập giá trị của n: ");
//		int n = scanner.nextInt();
//
//		double tong = tinhTong(n);
//
//		System.out.println("Tổng S là: " + tong);
//	}
//
//	static double tinhTong(int n) {
//		double tong = 0.0;
//		for (int i = 1; i <= n; i++) {
//			tong += 1.0 / (i * i);
//		}
//		return tong;
//	}
	
		/**
		 * 2
		 */
//		// Nhập vào 4 số nguyên
//		System.out.print("Nhập số thứ nhất: ");
//		int so1 = scanner.nextInt();
//
//		System.out.print("Nhập số thứ hai: ");
//		int so2 = scanner.nextInt();
//
//		System.out.print("Nhập số thứ ba: ");
//		int so3 = scanner.nextInt();
//
//		System.out.print("Nhập số thứ tư: ");
//		int so4 = scanner.nextInt();
//
//		// Kiểm tra và in ra số lượng số chẵn và số lẻ
//		int soChan = 0;
//		int soLe = 0;
//
//		if (so1 % 2 == 0) {
//			soChan++;
//		} else {
//			soLe++;
//		}
//
//		if (so2 % 2 == 0) {
//			soChan++;
//		} else {
//			soLe++;
//		}
//
//		if (so3 % 2 == 0) {
//			soChan++;
//		} else {
//			soLe++;
//		}
//
//		if (so4 % 2 == 0) {
//			soChan++;
//		} else {
//			soLe++;
//		}
//
//		System.out.println("Số lượng số chẵn: " + soChan);
//		System.out.println("Số lượng số lẻ: " + soLe);
//	}
		
		/**
		 * 3
		 */
//		System.out.print("Nhập điểm trung bình của sinh viên: ");
//		double dtb = scanner.nextDouble();
//
//		xepLoaiHocLuc(dtb);
//	}
//
//	static void xepLoaiHocLuc(double dtb) {
//		if (dtb >= 8) {
//			System.out.println("Học lực: Giỏi");
//		} else if (dtb >= 6.5 && dtb < 8) {
//			System.out.println("Học lực: Khá");
//		} else if (dtb < 6.5) {
//			System.out.println("Học lực: Trung bình");
//		} else {
//			System.out.println("Điểm không hợp lệ");
//		}
//	}
		
		/**
		 * 4
		 */
//		// Nhập số chữ điện tiêu thụ
//		System.out.print("Nhập số chữ điện tiêu thụ trong tháng: ");
//		int soChuDien = scanner.nextInt();
//
//		// Tính số tiền phải trả
//		double soTien = tinhTienDien(soChuDien);
//
//		System.out.println("Số tiền phải trả là: " + soTien + " VND");
//	}
//
//	static double tinhTienDien(int soChu) {
//		double gia1 = 1800;
//		double gia2 = 2500;
//		double gia3 = 3000;
//
//		double soTien = 0.0;
//
//		if (soChu >= 1 && soChu <= 100) {
//			soTien = soChu * gia1;
//		} else if (soChu <= 200) {
//			soTien = 100 * gia1 + (soChu - 100) * gia2;
//		} else {
//			soTien = 100 * gia1 + 100 * gia2 + (soChu - 200) * gia3;
//		}
//
//		return soTien;
//	}
		
		/**
		 * 5
		 */
//		System.out.print("Nhập điểm trung bình của sinh viên: ");
//		double diemTrungBinh = scanner.nextDouble();
//
//		if (diemTrungBinh >= 8.0) {
//			System.out.println("Học lực: Giỏi");
//		} else if (diemTrungBinh >= 6.5) {
//			System.out.println("Học lực: Khá");
//		} else {
//			System.out.println("Học lực: Trung bình");
//		}
//
//		scanner.close();
//	}
}
