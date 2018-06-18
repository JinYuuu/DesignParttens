package command_remote;

public class RemoteControlTest {
	/*
	public static void main(String[] args){
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}
	*/
	
	public static void main(String[] args){
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		Stereo stereo = new Stereo("Living Room");
		
		remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
		remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
		
		//lambda expression
		Command stereoOnWithCD = () -> {
			stereo.on(); stereo.setCD(); stereo.setVolume(11);
		};
		
		remoteControl.setCommand(2, stereoOnWithCD, stereo::off);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
	}
}
