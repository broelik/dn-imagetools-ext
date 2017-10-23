package org.develnext.jphp.ext.imagetools;



import org.develnext.jphp.ext.imagetools.classes.AnimatedGifEncoderWrapper;
import org.develnext.jphp.ext.imagetools.classes.GifDecoderWrapper;

import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class ImageToolsExtension extends Extension
{
	public static final String NS = "imagetools";
	
	@Override
	public Status getStatus()
	{
		return Status.EXPERIMENTAL;
	}

	@Override
	public void onRegister(CompileScope scope)
	{
		registerWrapperClass(scope, GifDecoder.class, GifDecoderWrapper.class);
		registerWrapperClass(scope, AnimatedGifEncoder.class, AnimatedGifEncoderWrapper.class);
	}
}