package yobuma.stat.dto;

import java.util.Date;

public class YobBookproPassengerDto{

    private int id;

    private String age;

    private int bagQty;

    private Date birthday;

    private String email;

    private String firstname;

    private String gender;

    private int groupId;

    private String lastname;

    private String notes;

    private String notesYb;

    private String params;

    private String passport;

    private String phone;

    private String pnr;

    private Date ppvalid;

    private double price;

    private double priceBag;

    private int returnBagQty;

    private double returnPrice;

    private double returnPriceBag;

    private int returnRouteId;

    private String returnSeat;

    private Date returnStart;

    private String seat;

    private String shortPhone;

    private Date start;

    private int state;

    private String title;

    private int countryId;

    private YobBookproBustripDto yobBookproBustrip;

    private YobBookproOrderDto yobBookproOrder;

    public YobBookproPassengerDto() {
    }

    public int getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public int getBagQty() {
        return bagQty;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getGender() {
        return gender;
    }

    public int getGroupId() {
        return groupId;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNotes() {
        return notes;
    }

    public String getNotesYb() {
        return notesYb;
    }

    public String getParams() {
        return params;
    }

    public String getPassport() {
        return passport;
    }

    public String getPhone() {
        return phone;
    }

    public String getPnr() {
        return pnr;
    }

    public Date getPpvalid() {
        return ppvalid;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceBag() {
        return priceBag;
    }

    public int getReturnBagQty() {
        return returnBagQty;
    }

    public double getReturnPrice() {
        return returnPrice;
    }

    public double getReturnPriceBag() {
        return returnPriceBag;
    }

    public int getReturnRouteId() {
        return returnRouteId;
    }

    public String getReturnSeat() {
        return returnSeat;
    }

    public Date getReturnStart() {
        return returnStart;
    }

    public String getSeat() {
        return seat;
    }

    public String getShortPhone() {
        return shortPhone;
    }

    public Date getStart() {
        return start;
    }

    public int getState() {
        return state;
    }

    public String getTitle() {
        return title;
    }

    public int getCountryId() {
        return countryId;
    }

    public YobBookproBustripDto getYobBookproBustrip() {
        return yobBookproBustrip;
    }

    public YobBookproOrderDto getYobBookproOrder() {
        return yobBookproOrder;
    }
}