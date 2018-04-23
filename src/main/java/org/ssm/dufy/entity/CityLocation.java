package org.ssm.dufy.entity;

public class CityLocation {
  private Integer id ;

    /**
     * 城市名
     */
  private String city;

    /**
     * 国家名
     */
  private String cnty;

    /**
     * 纬度
     */
  private String lat;

    /**
     * 经度
     */
  private String lon;

    /**
     * 省份
     */
  private String prov;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCnty() {
        return cnty;
    }

    public void setCnty(String cnty) {
        this.cnty = cnty;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }
}