package com.ilkertoksoz.vodafone.util;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

public class LocaleResolver extends CookieLocaleResolver {

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		String acceptLanguage = request.getHeader("Accept-Language");
		if (acceptLanguage == null || acceptLanguage.trim().isEmpty()) {
			return super.determineDefaultLocale(request);
		}
		return request.getLocale();
	}

	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasenames("i18n/messages");
		source.setUseCodeAsDefaultMessage(true);
		return source;
	}

	@Bean
	public LocaleResolver localeResolver() {
		return new LocaleResolver();
	}
}
