import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.Objects;

/**
 * The data class that is used to store the values
 */
public class Data implements Serializable {

    private String name;
    private String email;
    private String address;
    private int beds;
    private int baths;
    private String phone;

    public Data() {
    }

    public Data(String name, String email, String address, String beds, String baths, String phone) {
        this.name = name;
        this.email = email;
        this.address = address;

        if (beds != null)
            this.beds = Integer.valueOf(beds);

        if (baths != null)
            this.baths = Integer.valueOf(baths);

        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(String beds) {
        if (beds != null)
            this.beds = Integer.valueOf(beds);
    }

    public int getBaths() {
        return baths;
    }

    public void setBaths(String baths) {
        if (baths != null)
            this.baths = Integer.valueOf(baths);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(name, data.name) &&
                Objects.equals(email, data.email) &&
                Objects.equals(address, data.address) &&
                Objects.equals(beds, data.beds) &&
                Objects.equals(baths, data.baths) &&
                Objects.equals(phone, data.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, address, beds, baths, phone);
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", beds='" + beds + '\'' +
                ", baths='" + baths + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     * Used for converting String to json value.
     * @return
     * @throws JsonProcessingException
     */
    public String toJsonString() throws JsonProcessingException {
        return OBJECT_MAPPER.writeValueAsString(this);
    }
}
