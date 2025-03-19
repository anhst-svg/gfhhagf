
public class User {

    private String name;
    private String email;
    private String password;
    private float height;
    private float weight;

    public User() {

    }

    public User(String name, String email, String password, float height, float weight){
        this.name = name;
        this.email = email;
        this.password = password;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float getWeight(){
        return weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }
    @Override
    public String toString(){
        return "User(|name: " + name + " |email:" + email + " |password:" + password + " |height:" + height + " |weight:" + weight+ ")";
    }
}
