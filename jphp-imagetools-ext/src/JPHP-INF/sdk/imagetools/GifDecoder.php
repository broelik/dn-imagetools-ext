<?php 
namespace imagetools;

use php\gui\UXImage;

class GifDecoder
{
	/**
	 * @var int
	 * @readonly
	 */
	public $loopCount;
	/**
	 * @var int
	 * @readonly
	 */
	public $frameCount;
	/**
	 * @var UXImage
	 * @readonly
	 */
	public $image;
	/**
	 * @var double[]
	 * @readonly
	 */
	public $frameSize;
	
	/**
	 * @param int $n
	 * Gets display duration for specified frame.
	 * @return int
	 */
	public function getDelay($n){}
	/**
	 * @param int $n
	 * Gets the image contents of frame n.
	 * @return UXImage
	 */
	public function getFrame($n){}
	/**
	 * @param string $name
	 * Reads GIF file from specified file/URL source (URL assumed if name contains ":/" or "file:")
	 */
	public function read($name){}
}
?>