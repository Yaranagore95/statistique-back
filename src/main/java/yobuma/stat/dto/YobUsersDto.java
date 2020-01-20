package yobuma.stat.dto;

import java.util.Date;
import java.util.List;

public class YobUsersDto {

    private int id;

    private String name;

    private String username;

    private String email;

    private String password;

    private int block;

    private int sendEmail;

    private Date registerDate;

    private  Date lastvisitDate;

    private String activation;

    private String params;

    private Date lastResetTime;

    private  int resetCount;

    private String otpKey;

    private String otep;

    private int requireReset;

    private boolean isPasswordChanged;

    private List<YobUserRoleDto> roles;

    private YobBookproAgentDto agent;

    public YobUsersDto(String name, String username, String email, String password, int block, int sendEmail, Date registerDate, Date lastvisitDate, String activation, String params, Date lastResetTime, int resetCount, String otpKey, String otep, int requireReset, boolean isPasswordChanged) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.block = block;
        this.sendEmail = sendEmail;
        this.registerDate = registerDate;
        this.lastvisitDate = lastvisitDate;
        this.activation = activation;
        this.params = params;
        this.lastResetTime = lastResetTime;
        this.resetCount = resetCount;
        this.otpKey = otpKey;
        this.otep = otep;
        this.requireReset = requireReset;
        this.isPasswordChanged = isPasswordChanged;
        this.email = email;
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

    public Date getLastResetTime() {
        return lastResetTime;
    }

    public void setLastResetTime(Date lastResetTime) {
        this.lastResetTime = lastResetTime;
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

    public boolean isPasswordChanged() {
        return isPasswordChanged;
    }

    public void setPasswordChanged(boolean passwordChanged) {
        isPasswordChanged = passwordChanged;
    }

    public List<YobUserRoleDto> getRoles() {
        return roles;
    }

    public void setRoles(List<YobUserRoleDto> roles) {
        this.roles = roles;
    }

    public YobBookproAgentDto getAgent() {
        return agent;
    }

    public void setAgent(YobBookproAgentDto agent) {
        this.agent = agent;
    }
}

