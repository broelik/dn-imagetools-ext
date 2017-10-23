<?php 
namespace imagetools;

use php\gui\paint\UXColor;
use php\gui\UXImage;

class AnimatedGifEncoder
{
	/**
	 * @var int
	 * @readonly
	 */
	public $delay;
	/**
	 * @var int
	 * @readonly
	 */
	public $dispose;
	/**
	 * @var int
	 * @readonly
	 */
	public $frameRate;
	/**
	 * @var int
	 * @readonly
	 */
	public $quality;
	/**
	 * @var int
	 * @readonly
	 */
	public $repeat;
	/**
	 * @var double[]
	 * @readonly
	 */
	public $size;
	
	/**
	 * @var UXColor
	 * @readonly
	 */
	public $transparent;
	
	/**
	 * @param UXImage $frame
	 * @return boolean
	 */
	public function addFrame(UXImage $frame){}
	/**
	 * @param string $fname
	 * @return boolean
	 */
	public function start($fname){}
	/**
	 * @return boolean
	 */
	public function finish(){}
}
?>