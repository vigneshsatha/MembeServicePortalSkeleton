package com.cts.memberservice.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cts.memberservice.vo.Member;

public class MemberServiceValidator implements Validator {

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(Class<?> c) {
		return Member.class.isAssignableFrom(c);
	}

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	public void validate(Object command, Errors errors) {
		//Do the validations here
	}

}
