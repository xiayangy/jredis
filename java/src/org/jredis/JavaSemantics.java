/*
 *   Copyright 2009 Joubin Houshyar
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *    
 *   http://www.apache.org/licenses/LICENSE-2.0
 *    
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.jredis;

import java.util.Set;

/**
 * [NOTE: This interface is not officially in spec but projected to be included
 * in subject to further consideration.]
 * [TODO: document me!]
 *
 * @author  Joubin Houshyar (alphazero@sensesay.net)
 * @version alpha.0, Apr 08, 2009
 * @since   alpha.0
 * 
 * @param <T>
 */
public interface JavaSemantics <T> {
	
	public RedisSet  <T> 	set  (String aSetTypeKey) throws RedisException;
	public RedisList <T> 	list (String aListTypeKey) throws RedisException;
	public RedisMap  <T> 	map (String aStringTypeKey) throws RedisException;
	
	public interface RedisSet<T> extends Set<T> {
		
	}
	public interface RedisList<T> extends Set<T> {
		
	}
	public interface RedisMap <T> extends Set<T> {
		
	}
}
