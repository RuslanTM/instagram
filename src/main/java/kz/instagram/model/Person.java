package kz.instagram.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Person")
public class Person implements Serializable {
    public Person() {

    }

    public Person(String name, String login, String sex) {
        this.id = 5;
        this.name = name;
        this.login = login;
        this.sex = sex;
        this.registeredDate = new java.util.Date();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERSON_ID", nullable = false)
    private long id;

    @Column(name = "PERSON_NAME", nullable = false)
    private String name;

    @Column(name = "PERSON_LOGIN", nullable = false, unique = true, length = 20)
    private String login;

    @Column(name = "ADDITIONAL_INFO")
    private String additionalInfo;

    @Column(name = "PERSON_BIRTHDAY")
    private Date birthDay;

    @Column(name = "PHONE_NUM")
    private String phoneNum;

    @Column(name = "SEX", nullable = false)
    private String sex;

    @Column(name = "REGISTERED_DATE", nullable = false)
    private Date registeredDate;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person", fetch = FetchType.LAZY)
//    private List<Publication> publicationList;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

  /*  public List<Publication> getPublicationList() {
        return publicationList;
    }

    public void setPublicationList(List<Publication> publicationList) {
        this.publicationList = publicationList;
    }
*/
}
