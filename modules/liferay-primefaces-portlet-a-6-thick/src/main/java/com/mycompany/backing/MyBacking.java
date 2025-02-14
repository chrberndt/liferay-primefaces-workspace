package com.mycompany.backing;

import com.mycompany.dto.Greeting;
import org.primefaces.event.TabChangeEvent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
// If building with Maven, specify the "-P cdi" profile to activate CDI.
public class MyBacking {

	private Greeting greeting = new Greeting();

	public Greeting getGreeting() {
		return greeting;
	}

	public void onChange(TabChangeEvent event) {
		System.out.println("onChange()");
		System.out.println("event.getTab(): " + event.getTab());
	}
}
