package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Samsung {
	@Autowired
 MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	 public void MobileConfig() {
		 System.out.println("Quality : ram 8 GB CAmera 128mp ");
		 cpu.processor();
	 }

}
