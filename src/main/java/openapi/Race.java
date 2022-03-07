package openapi;

public class Race {

    public String name, slug, desc, asi_desc, age, alignment, size, speed_desc, languages, vision, traits, docuemnt__slug, document__title,
            document__license_url;
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
