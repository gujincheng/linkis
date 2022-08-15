/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.linkis.cs.execution.matcher;

import org.apache.linkis.cs.common.entity.enumeration.ContextType;
import org.apache.linkis.cs.common.entity.source.ContextKeyValue;
import org.apache.linkis.cs.condition.impl.ContextTypeCondition;

public class ContextTypeContextSearchMatcher extends AbstractContextSearchMatcher {

  ContextType contextType;

  public ContextTypeContextSearchMatcher(ContextTypeCondition condition) {
    super(condition);
    contextType = condition.getContextType();
  }

  @Override
  public Boolean match(ContextKeyValue contextKeyValue) {
    return contextType.equals(contextKeyValue.getContextKey().getContextType());
  }
}
