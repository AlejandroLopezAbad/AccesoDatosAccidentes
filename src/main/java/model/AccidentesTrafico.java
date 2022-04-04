package model;

import java.time.LocalTime;

public class AccidentesTrafico {
    private String numexpediente;
    private String fecha;
    private LocalTime hora;
    private String localizacion;
    private String numero;
    private String districtocodigo;
    private String districtonombre;
    private String tipoAccidente;
    private String estadometeorológico;
    private String tipovehiculo;
    private String tipopersona;
    private String rangoedad;
    private String sexo;
    private String codlesividad;
    private String lesividad;
    private String coordenadaxutm;
    private String coordenadayutm;
    private String positivaalcohol;
    private String positivadroga;



    public AccidentesTrafico(String numexpediente, String fecha, String hora, String localizacion, String numero, String districtocodigo, String districtonombre, String tipoAccidente, String estadometeorológico, String tipovehiculo, String tipopersona, String rangoedad, String sexo, String codlesividad, String lesividad, String coordenadaxutm, String coordenadayutm, String positivaalcohol, String positivadroga) {
        this.numexpediente = numexpediente;
        this.fecha = fecha;
        this.hora = LocalTime.parse(hora);
        this.localizacion = localizacion;
        this.numero = numero;
        this.districtocodigo = districtocodigo;
        this.districtonombre = districtonombre;
        this.tipoAccidente = tipoAccidente;
        this.estadometeorológico = estadometeorológico;
        this.tipovehiculo = tipovehiculo;
        this.tipopersona = tipopersona;
        this.rangoedad = rangoedad;
        this.sexo = sexo;
        this.codlesividad = codlesividad;
        this.lesividad = lesividad;
        this.coordenadaxutm = coordenadaxutm;
        this.coordenadayutm = coordenadayutm;
        this.positivaalcohol = positivaalcohol;
        this.positivadroga = positivadroga;
    }

    public String getNum_expediente() {
        return numexpediente;
    }

    public void setNumexpediente(String numexpediente) {
        this.numexpediente = numexpediente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDistrictocodigo() {
        return districtocodigo;
    }

    public void setDistrictocodigo(String districtocodigo) {
        this.districtocodigo = districtocodigo;
    }

    public String getDistrictonombre() {
        return districtonombre;
    }

    public void setDistrictonombre(String districtonombre) {
        this.districtonombre = districtonombre;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public String getEstadometeorológico() {
        return estadometeorológico;
    }

    public void setEstadometeorológico(String estadometeorológico) {
        this.estadometeorológico = estadometeorológico;
    }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public String getTipopersona() {
        return tipopersona;
    }

    public void setTipopersona(String tipopersona) {
        this.tipopersona = tipopersona;
    }

    public String getRangoedad() {
        return rangoedad;
    }

    public void setRangoedad(String rangoedad) {
        this.rangoedad = rangoedad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCodlesividad() {
        return codlesividad;
    }

    public void setCodlesividad(String codlesividad) {
        this.codlesividad = codlesividad;
    }

    public String getLesividad() {
        return lesividad;
    }

    public void setLesividad(String lesividad) {
        this.lesividad = lesividad;
    }

    public String getCoordenadaxutm() {
        return coordenadaxutm;
    }

    public void setCoordenadaxutm(String coordenadaxutm) {
        this.coordenadaxutm = coordenadaxutm;
    }

    public String getCoordenadayutm() {
        return coordenadayutm;
    }

    public void setCoordenadayutm(String coordenadayutm) {
        this.coordenadayutm = coordenadayutm;
    }

    public String getPositivaalcohol() {
        return positivaalcohol;
    }

    public void setPositivaalcohol(String positivaalcohol) {
        this.positivaalcohol = positivaalcohol;
    }

    public String getPositivadroga() {
        return positivadroga;
    }

    public void setPositivadroga(String positivadroga) {
        this.positivadroga = positivadroga;
    }
    @Override
    public String toString() {
        return  "numexpediente='" + numexpediente + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", numero='" + numero + '\'' +
                ", districtocodigo='" + districtocodigo + '\'' +
                ", districtonombre='" + districtonombre + '\'' +
                ", tipoAccidente='" + tipoAccidente + '\'' +
                ", estadometeorológico='" + estadometeorológico + '\'' +
                ", tipovehiculo='" + tipovehiculo + '\'' +
                ", rangoedad='" + rangoedad + '\'' +
                ", sexo='" + sexo + '\'' +
                ", codlesividad='" + codlesividad + '\'' +
                ", lesividad='" + lesividad + '\'' +
                ", coordenadaxutm='" + coordenadaxutm + '\'' +
                ", coordenadayutm='" + coordenadayutm + '\'' +
                ", positivaalcohol='" + positivaalcohol + '\'' +
                ", positivadroga='" + positivadroga + '\'' +
                '}';
    }


}
