package module;

public class Tovar_complex {
    
    private String name;
    private String quality;
    private Integer price;
    
    public Tovar_complex(String name, String quality, Integer price, String country, Integer weight) {
        this.name = name;
        this.quality = quality;
        this.price = price;
    }

    public Tovar_complex(){
    }
 
    public String getName() {
     return name;
    }
 
    public void setName(String name) {
     this.name = name;
    }
 
    public String getQuality() {
     return quality;
    }
 
    public void setQuality(String quality) {
     this.quality = quality;
    }
 
    public Integer getPrice() {
     return price;
    }
    
    public void setPrice(Integer price) {
     this.price = price;
    }
    
}
