package src.models;

import java.util.Date;

import src.enums.Gender;
import src.enums.Specialty;

public class Candidate {
    private String code;
    private String name;
    private String address;
    private String phone;
    private Date birthDate;
    private String photo;
    private String province;
    private Gender gender;
    private String heightRange;
    private String ageRange;
    private String hairColor;
    private String eyeColor;
    private Specialty specialty; // "model" or "actor"
    private String experience;
    private Representative representative;
    private Profile profile;

    public Candidate() {}

    public Candidate(
        String code,
        String name,
        String address,
        String phone,
        Date birthDate,
        String photo,
        String province,
        Gender gender,
        String heightRange,
        String ageRange,
        String hairColor,
        String eyeColor,
        String experience,
        Representative representative,
        Profile profile
    ) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
        this.photo = photo;
        this.province = province;
        this.gender = gender;
        this.heightRange = heightRange;
        this.ageRange = ageRange;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.specialty = Specialty.MODEL;
        this.experience = experience;
        this.representative = representative;
        this.profile = profile;
    }

    public Candidate(
        String code,
        String name,
        String address,
        String phone,
        Date birthDate,
        String photo,
        String province,
        Gender gender,
        String heightRange,
        String ageRange,
        String hairColor,
        String eyeColor,
        Specialty specialty,
        String experience,
        Representative representative,
        Profile profile
    ) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
        this.photo = photo;
        this.province = province;
        this.gender = gender;
        this.heightRange = heightRange;
        this.ageRange = ageRange;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.specialty = specialty;
        this.experience = experience;
        this.representative = representative;
        this.profile = profile;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getHeightRange() {
        return this.heightRange;
    }

    public void setHeightRange(String heightRange) {
        this.heightRange = heightRange;
    }

    public String getAgeRange() {
        return this.ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Specialty getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public String getExperience() {
        return this.experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Representative getRepresentative() {
        return this.representative;
    }

    public void setRepresentative(Representative representative) {
        this.representative = representative;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
