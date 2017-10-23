package org.develnext.jphp.ext.imagetools.classes;


import org.develnext.jphp.ext.imagetools.AnimatedGifEncoder;
import org.develnext.jphp.ext.imagetools.ImageToolsExtension;
import org.develnext.jphp.ext.javafx.classes.paint.UXColor;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.*;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.DoubleMemory;
import php.runtime.memory.LongMemory;
import php.runtime.reflection.ClassEntity;

@Namespace(ImageToolsExtension.NS)
@Name("AnimatedGifEncoder")
public class AnimatedGifEncoderWrapper extends BaseWrapper<AnimatedGifEncoder>
{
	public AnimatedGifEncoderWrapper(Environment env, ClassEntity clazz)
	{
		super(env, clazz);
	}
	public AnimatedGifEncoderWrapper(Environment env, AnimatedGifEncoder wrappedObject)
	{
		super(env, wrappedObject);
	}
	@Signature
	public void __construct()
	{
		__wrappedObject = new AnimatedGifEncoder();
	}
	@Signature
	public Memory addFrame(Image image)
	{
		return getWrappedObject().addFrame(SwingFXUtils.fromFXImage(image, null)) ? Memory.TRUE : Memory.FALSE;
	}
	@Signature
	public Memory start(String fname)
	{
		return getWrappedObject().start(fname) ? Memory.TRUE : Memory.FALSE;
	}
	@Signature
	public Memory finish()
	{
		return getWrappedObject().finish() ? Memory.TRUE : Memory.FALSE;
	}
	
	@Setter
	public void setDelay(int delay)
	{
		getWrappedObject().setDelay(delay);
	}
	@Getter
	public Memory getDelay()
	{
		return LongMemory.valueOf(getWrappedObject().getDelay());
	}
	
	@Setter
	public void setDispose(int dispose)
	{
		getWrappedObject().setDispose(dispose);
	}
	@Getter
	public Memory getDispose()
	{
		return LongMemory.valueOf(getWrappedObject().getDispose());
	}
	
	@Setter
	public void setFrameRate(int fps)
	{
		getWrappedObject().setFrameRate(fps);
	}
	@Getter
	public Memory getFrameRate()
	{
		return DoubleMemory.valueOf(getWrappedObject().getFrameRate());
	}
	
	@Setter
	public void setQuality(int quality)
	{
		getWrappedObject().setQuality(quality);
	}
	@Getter
	public Memory getQuality()
	{
		return LongMemory.valueOf(getWrappedObject().getQuality());
	}
	
	@Setter
	public void setRepeat(int iter)
	{
		getWrappedObject().setRepeat(iter);
	}
	@Getter
	public Memory getRepeat()
	{
		return LongMemory.valueOf(getWrappedObject().getRepeat());
	}
	
	@Setter
	public void setSize(int[] arr)
	{
		if(arr.length == 2)
			getWrappedObject().setSize(arr[0], arr[1]);
	}
	@Getter
	public Memory getSize()
	{
		return ArrayMemory.ofIntegers(getWrappedObject().getSize());
	}
	
	@Setter
	public void setTransparent(Color color)
	{
		getWrappedObject().setTransparent(
				new java.awt.Color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), (float)color.getOpacity()));
	}
	@Getter
	public UXColor getTransparent(Environment env)
	{
		java.awt.Color color = getWrappedObject().getTransparent();
		return new UXColor(env, new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha() / 255.0));
	}
	public static void main(String... args)
	{
		java.awt.Color c = new java.awt.Color(0.0f, 0.0f, 0.0f, 1.0f);
	}
}