package com.javaex.ex12;

public class TV {
	private int channel, volume;
	private boolean power;
	private String powerStatus;

	public TV() {
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		
		if(power == true) {
			this.powerStatus = "켜짐";
		}
		else{
			this.powerStatus = "꺼짐";
		}
	}

	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	// 전원
	public void power(boolean on) {
		if(on == true) {
			this.power = true;
			this.powerStatus = "켜짐";
			System.out.println("전원 켜짐");
		}
		else {
			this.power = false;
			this.powerStatus = "꺼짐";
			System.out.println("전원 꺼짐");
		}
	}

	// 채널
	public void channel(int channel) {
		if(channel > 255) {
			channel = 255;
		}
		else if(channel <= 1) {
			channel = 1;
		}
		
		this.channel = channel;
	}
	
	// 채널 이동
	public void channel(boolean up) {
		if(up == true && channel < 255) {
			channel++;
		}
		else if(up == false && channel > 1){
			channel--;
		}
	}
	
	// 볼륨
	public void volume(int volume) {
		if(volume > 100) {
			volume = 100;
		}
		else if(volume <= 0) {
			volume = 0;
		}
	
		this.volume = volume;		
	}
	// 볼륨 크기 조절
	public void volume(boolean up) {
		if(up == true && volume < 100) {
			volume++;
		}
		else if(up == false && volume >= 0){
			volume--;
		}
	}
	
	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}

	public void status() {
		System.out.println("채널 : " + channel + " / 볼륨 : " + volume + " / 전원 : " + powerStatus);
	}
}
