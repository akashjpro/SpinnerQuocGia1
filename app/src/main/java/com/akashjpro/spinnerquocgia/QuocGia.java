package com.akashjpro.spinnerquocgia;

import java.io.Serializable;

/**
 * Created by Akashjpro on 8/31/2016.
 */
public class QuocGia implements Serializable {

    private String tenQuocGia;
    private int imgLaCo;

    public QuocGia(int imgLaCo, String tenQuocGia) {
        this.imgLaCo = imgLaCo;
        this.tenQuocGia = tenQuocGia;
    }

    public int getImgLaCo() {
        return imgLaCo;
    }

    public void setImgLaCo(int imgLaCo) {
        this.imgLaCo = imgLaCo;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
}
