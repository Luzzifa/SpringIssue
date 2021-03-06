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

package com.example.test;

import org.junit.Assert;
import org.junit.Test;

import com.example.api.ExampleFactory;

/**
 * TODO: purpose of this class
 * <p style="font-style:italic;font-variant:small-caps;font-size:80%">
 * Copyright &copy; Luzzifa.de 2013 All rights reserved.
 * </p>
 * @author Wolfgang Deifel
 */
public class TestExampleFactory
{

	@Test
	public void testLookupTheExampleFactoryImplementation()
	{
		Assert.assertNotNull("ExampleFactory not found", ExampleFactory.getInstance());
	}

	@Test
	public void testLookupTheExampleServiceImplementation()
	{
		Assert.assertNotNull("ExampleService not found", ExampleFactory.getInstance().getService());
	}

	@Test
	public void testThatSomeObjectIsAlwaysSameInstance()
	{
		final Object someObject1 = ExampleFactory.getInstance().getSomeObject();
		final Object someObject2 = ExampleFactory.getInstance().getSomeObject();
		
		Assert.assertSame("SomeObject are different", someObject1, someObject2);
	}

}
