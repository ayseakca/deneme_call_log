package com.example.deneme_call_log.Model;

public class Calls {
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getCallType() {
        return CallType;
    }

    public void setCallType(String callType) {
        CallType = callType;
    }

    public String getCallDate() {
        return CallDate;
    }

    public void setCallDate(String callDate) {
        CallDate = callDate;
    }

    public String getCallDuration() {
        return CallDuration;
    }

    public void setCallDuration(String callDuration) {
        CallDuration = callDuration;
    }

    public String getCallLocation() {
        return CallLocation;
    }

    public void setCallLocation(String callLocation) {
        CallLocation = callLocation;
    }

    private String PhoneNumber;
    private String CallType;
    private String CallDate;
    private String CallDuration;
    private String CallLocation;

    public Calls(String phoneNumber, String callType, String callDate, String callDuration, String callLocation) {
        PhoneNumber = phoneNumber;
        CallType = callType;
        CallDate = callDate;
        CallDuration = callDuration;
        CallLocation = callLocation;
    }




}
