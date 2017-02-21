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

/**
 * Class responsible for Rank sub-routines for KN subset combinatorial elements.
 * 
 * @author Glaucio Melo (glaucio.melo@gmail.com)
 * 
 */
public class GMRank {

	public static void rank(GMStruct g) {
		// TODO
		System.out.println(g);
	}

	public static void main(String[] args) {
		byte b[] = { 50 };
		GMStruct s = GMStruct.marshalling(b);
		GMRank.rank(s);
	}
}
