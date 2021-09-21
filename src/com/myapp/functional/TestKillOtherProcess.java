package com.myapp.functional;

import java.io.IOException;

public class TestKillOtherProcess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		ProcessHandle processhandle =
//		ProcessHandle.allProcesses()
//		.filter(h -> h.info()
//				.commandLine()
//		.map(cmd -> cmd.contains("TextEdit")).orElse(false))
//		.findFirst()
//		.orElseThrow(()-> new IllegalArgumentException("No Handler Found"));
//		
//
//		System.out.println(processhandle.info());
//		processhandle.destroyForcibly();
//		
//		processhandle.onExit()
//		.thenAccept(h -> System.out.println("TextEditor was killed by java process"));
	Process builder=
		new ProcessBuilder("bash","-c","while true;do sleep 1;done").start();
	
	ProcessHandle handle= builder.toHandle();
	
	handle.onExit().thenAccept(p-> System.out.println("Process "+p+ "was killed"));
	System.out.println("Press Enter To Continue");
	System.in.read();
	
	if(handle.supportsNormalTermination()) {
		System.out.println("Killing Process");
		handle.destroy();
	}
	System.out.println("Press Enter To Finish");
	System.in.read();
	
	}

}
