package resources;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
  public class Station {
    public double lat;
    public double lng;
    public String name;

  public Station() { }

  public Station(double lat, double lng, String longName, String shortName, String normalName) {
    this.lat = lat;
    this.lng = lng;
    this.namen = new Names(longName, shortName, normalName);
  }

  static class Names {
      public String lang;
      public String kort;
      public String middel;
      public Names(String longName, String shortName, String normalName) {
        lang = longName;
        kort = shortName;
        middel = normalName;
      }
    }

    public Names namen;

  }
