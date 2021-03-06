/*   Copyright {2017} {Glaucio Melo - glaucio.melo@gmail.com}

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.*/
package br.com.gm;

import org.junit.Test;

public class RecursiveFullKNSubsetTest {
	
	@Test
	public void algorithmTest() {
		int n = 9, k = 3;
		boolean show = true;
		RecursiveFullKNSubset c = new RecursiveFullKNSubset();
		long r = System.currentTimeMillis();
		c.fullKNSubSet(n, k, show, 70);
		System.out.println();
		System.out.println("Time elapsed: " + (System.currentTimeMillis() - r) + "ms");
	}
 
}
