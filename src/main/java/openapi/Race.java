package openapi;

public class Race {

    public String name;
    public String slug;
    public String desc;
    public String asi_desc;
    public String age;
    public String alignment;
    public String size;
    public String speed_desc;
    public String languages;
    public String vision;
    public String traits;
    public String docuemnt__slug;
    public String document__title;
    public String document__license_url;
    public AttributeIncrease[] asi;
    public Speed speed;
    Race[] subraces;

    public class AttributeIncrease {

        public String[] attributes;
        public int value;
    }

    public class Speed {

        public Integer walk, swim, fly;
    }
}
