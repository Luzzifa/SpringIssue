/**
 * Copyright 2013 Wolfgang Deifel, Luzzifa.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.api;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO: purpose of this class
 * <p style="font-style:italic;font-variant:small-caps;font-size:80%">
 * Copyright &copy; Luzzifa.de 2013 All rights reserved.
 * </p>
 * @author Wolfgang Deifel
 */
public abstract class ExampleFactory
{
	private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	/**
	 * static factory method
	 * @return
	 */
	public static ExampleFactory getInstance()
	{
		if (!context.isActive())
		{
			context.scan("com.example.impl");
			context.refresh();
		}
		return context.getBean(ExampleFactory.class);
	}
	
	/**
	 * 
	 */
	public ExampleFactory()
	{
		// TODO Auto-generated constructor stub
	}
	
	public abstract ExampleService getService();

	public abstract Object getSomeObject();

}
