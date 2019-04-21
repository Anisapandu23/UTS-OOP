package model; 

public class HP {

    private String no_service;
    private String jenis_hp;
    private String nama_pemilik;
    private String jenis_service;

    public HP() {}

    public HP(String no_service, String jenis_hp, String nama_pemilik, String jenis_service) {
        this.no_service=no_service;
        this.jenis_hp=jenis_hp;
        this.nama_pemilik=nama_pemilik;
        this.jenis_service=jenis_service;
    }

    @Override
    public boolean equals(Object obj) {
        HP hp = (HP) obj;
        if(this.no_service.equals(hp.getNo_service())) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "[ " + no_service + ", " + jenis_hp + ", " + nama_pemilik + ", " + jenis_service + " ];";
    }

    public String getNo_service() {
        return no_service;
    }

    public void setNo_service(String no_service) {
        this.no_service = no_service;
    }

    public String getJenis_hp() {
        return jenis_hp;
    }

    public void setJenis_hp(String jenis_hp) {
        this.jenis_hp = jenis_hp;
    }

    public String getNama_pemilik() {
        return nama_pemilik;
    }

    public void setNama_pemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }

    public String getJenis_service() {
        return jenis_service;
    }

	public void setJenis_service(String jenis_service) {
		this.jenis_service = jenis_service;
	}   
}