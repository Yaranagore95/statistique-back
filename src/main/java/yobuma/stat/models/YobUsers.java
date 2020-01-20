package yobuma.stat.models;

import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "yob_users")
@NamedQuery(name = "YobUsers.findAll", query = "SELECT y FROM YobUsers y")
public class YobUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "block")
    private int block;

    @Transient
    // @Column(name = "sendEmail")
    private int sendEmail;

    @Transient
    //@Column(name = "registerDate")
    private Date registerDate;

    @Transient
    // @Column(name = "lastvisitDate")
    private  Date lastvisitDate;

    @Column(name = "activation")
    private String activation;

    @Column(name = "params")
    private String params;

    @Transient
    // @Column(name = "lastResetDate")
    private Date lastResetDate;

    @Transient
    // @Column(name = "resetCount")
    private  int resetCount;

    @Transient
    // @Column(name = "otpKey")
    private String otpKey;

    @Column(name = "otep")
    private String otep;

    @Transient
    // @Column(name = "requireReset")
    private int requireReset;


    public YobUsers(String username, String encodedPassword, String fullname) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(int sendEmail) {
        this.sendEmail = sendEmail;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getLastvisitDate() {
        return lastvisitDate;
    }

    public void setLastvisitDate(Date lastvisitDate) {
        this.lastvisitDate = lastvisitDate;
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Date getLastResetDate() {
        return lastResetDate;
    }

    public void setLastResetDate(Date lastResetDate) {
        this.lastResetDate = lastResetDate;
    }

    public int getResetCount() {
        return resetCount;
    }

    public void setResetCount(int resetCount) {
        this.resetCount = resetCount;
    }

    public String getOtpKey() {
        return otpKey;
    }

    public void setOtpKey(String otpKey) {
        this.otpKey = otpKey;
    }

    public String getOtep() {
        return otep;
    }

    public void setOtep(String otep) {
        this.otep = otep;
    }

    public int getRequireReset() {
        return requireReset;
    }

    public void setRequireReset(int requireReset) {
        this.requireReset = requireReset;
    }
}
