/**
 * 
 */
package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * @author harsh
 *
 */
@Component
public class HappyFortuneService implements FortuneService {

	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.FortuneService#getDailyFortue()
	 */
	@Override
	public String getDailyFortue() {
		return "Today is your lucky day";
	}

}
