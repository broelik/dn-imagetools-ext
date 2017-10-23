package org.develnext.jphp.ext.imagetools.classes;



import java.awt.Dimension;

import org.develnext.jphp.ext.imagetools.GifDecoder;
import org.develnext.jphp.ext.imagetools.ImageToolsExtension;
import org.develnext.jphp.ext.javafx.classes.UXImage;

import javafx.embed.swing.SwingFXUtils;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.*;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.LongMemory;
import php.runtime.reflection.ClassEntity;

@Namespace(ImageToolsExtension.NS)
@Name("GifDecoder")
public class GifDecoderWrapper extends BaseWrapper<GifDecoder>
{
	public GifDecoderWrapper(Environment env, ClassEntity clazz)
	{
		super(env, clazz);
	}
	public GifDecoderWrapper(Environment env, GifDecoder wrappedObject)
	{
		super(env, wrappedObject);
	}
	@Signature
	public void __construct()
	{
		__wrappedObject = new GifDecoder();
	}
	@Signature
	public Memory getDelay(int n)
	{
		return LongMemory.valueOf(getWrappedObject().getDelay(n));
	}
	@Signature
	public UXImage getFrame(Environment env, int n)
	{
		return new UXImage(env, SwingFXUtils.toFXImage(getWrappedObject().getFrame(n), null));
	}
	@Signature
	public Memory read(String name)
	{
		return LongMemory.valueOf(getWrappedObject().read(name));
	}

	
	@Getter
	public Memory getFrameCount()
	{
		return LongMemory.valueOf(getWrappedObject().getFrameCount());
	}
	@Getter
	public UXImage getImage(Environment env)
	{
		return new UXImage(env, SwingFXUtils.toFXImage(getWrappedObject().getImage(), null));
	}
	@Getter
	public Memory getLoopCount()
	{
		return LongMemory.valueOf(getWrappedObject().getLoopCount());
	}
	@Getter
	public Memory getFrameSize()
	{
		Dimension dim = getWrappedObject().getFrameSize();
		return ArrayMemory.ofDoubles(dim.getWidth(), dim.getHeight());
	}
}