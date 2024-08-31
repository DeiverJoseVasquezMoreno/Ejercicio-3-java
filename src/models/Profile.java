package src.models;

import src.enums.Gender;
import src.enums.Specialty;

public class Profile {
    private String province;
    private Gender gender;
    private String heightRange;
    private String ageRange;
    private String hairColor;
    private String eyeColor;
    private Specialty specialty;
    private String experience;

    public Profile() {}

    public Profile(
        String province,
        Gender gender,
        String heightRange,
        String ageRange,
        String hairColor,
        String eyeColor,
        String experience
    ) {
        this.province = province;
        this.gender = gender;
        this.heightRange = heightRange;
        this.ageRange = ageRange;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.specialty = Specialty.MODEL;
        this.experience = experience;
    }

    public Profile(
        String province,
        Gender gender,
        String heightRange,
        String ageRange,
        String hairColor,
        String eyeColor,
        Specialty specialty,
        String experience
    ) {
        this.province = province;
        this.gender = gender;
        this.heightRange = heightRange;
        this.ageRange = ageRange;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.specialty = specialty;
        this.experience = experience;
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
}
