package model;

/*
  Tác giả: Lê Thế Nguyên
 */
public class KhachHang {

    private String maso;
    private String hoten;
    private int loai;
    private double chisocu;
    private double chisomoi;

    public KhachHang() {
    }

    public KhachHang(String maso) {
        this.maso = maso;
    }

    public KhachHang(String maso, String hoten, int loai, double chisocu, double chisomoi) {
        this.maso = maso;
        this.hoten = hoten;
        this.loai = loai;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public double getChisocu() {
        return chisocu;
    }

    public void setChisocu(double chisocu) {
        this.chisocu = chisocu;
    }

    public double getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(double chisomoi) {
        this.chisomoi = chisomoi;
    }

    //sinh viên cài đặt xử lý cho các phương thức sau    
    public double getTieuThu() {
        return 0;
    }

    public double getTienTra() {
        double tieuthu = getTieuThu();
        double tientra = 0;
        if (loai == 1) {
            tientra = tieuthu * 4.575;
            
        }
            else if (loai == 2) {
                        if (tieuthu <= 50) {
                            tientra = tieuthu * 1.806;
                        } else if (tieuthu <=100) {
                            tientra = 50 * 1.806 + (tieuthu - 50) * 1.866;
                            
                        }else if (tieuthu <= 200){
                            tientra = 50 * 1.806 + 50 * 1.866 +  (tieuthu - 100)*2.167;
                        }else if (tieuthu <= 300){
                            tientra = 50*1.806 + 100 *2.167 + (tieuthu - 200) * 2.729;
                        }else if (tieuthu <=400){
                            tientra = 50*1.806 + 100 *2.167 + 100  * 2.729 + (tieuthu - 300) * 3.050;
                        }else if (tieuthu <= 500){
                            tientra = 50*1.806 + 100 *2.167 + 100  * 2.729 + 100 * 3.050 + (tieuthu - 400) * 3.151;
                        }
                    }
        tientra *= 1.08;
        return tientra;

        

    }
}
