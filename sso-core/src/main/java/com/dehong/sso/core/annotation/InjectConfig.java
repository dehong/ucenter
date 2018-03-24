package com.dehong.sso.core.annotation;

import org.seasar.doma.AnnotateWith;
import org.seasar.doma.Annotation;
import org.seasar.doma.AnnotationTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/** 
 * 
 * @author   created by dehong
 * @date     2018年3月24日 下午9:36:27
 * 
 */

@AnnotateWith(annotations = { @Annotation(target = AnnotationTarget.CLASS, type = Component.class),
		@Annotation(target = AnnotationTarget.CONSTRUCTOR, type = Autowired.class) })
public @interface InjectConfig
{

}
