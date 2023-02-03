package com.testingShastra_utils;

public interface IjmeetLocator {
	String HomePageSignIn="//a[contains (text(),' Sign In ')]";
	String EmailInput="//input[@placeholder=' Enter email address ']";
	String PasswordInput="//input[@placeholder=' Enter password ']";
	String SignInPageButton="//button[contains (text(),' Sign In ')]";
	String ScheduledMeeting="(//span[contains (text(),' Schedule Meeting ')])[2]";
	String MeetingTopic="//input[@placeholder=' Enter Meeting Topic']";
	String MeetingDecription="//textarea[@placeholder=' Enter Meeting Description ']";
	String MeetingInvites="//input[@type='text' and @class='multiple_emails-input text-left']";
	String WhenDate="//input[@type='text' and @id='edit_start_end_date']";
	String WhenTime="//input[@type='text' and @name='start_time_new']";
	String DurationHRS="//select[@class='form-control' and @id='edit_hour']";
	String DurationMins="//select[@class='form-control' and @id='edit_minute']";
	String TimeZone="//select[@class='form-control' and @name='timezone']/option";
	String Language="//select[@class='form-control' and @id='email_template_language']/option";
	String CheckBox="//em[@class='input-helper']"; //only you need to take which is needed among four
	String Sliderounder="//span[@class='slider round']"; //only you need to take which is needed among three
	String SubmitMettingButton="//input[@id='submitmeeting']";
	String QuickMeeting="//img[@alt='Quick Meeting ']";
	String Close="//span[@class='close']";
	String Whiteboard="(//div[@class='jitsi-icon jitsi-icon-default '])[12]";
	String VideoContainer_OverLay="//div[@class='videocontainer__hoverOverlay']";
	String Hangon_Button="//div[@class='toolbox-icon   hangup-button']";
	String Profile_Dropdown="//a[@id='profileDropdown']";
	String Logout="//a[@class='dropdown-item']";
}
