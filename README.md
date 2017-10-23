## dn-imagetools-ext
Пакет для работы с анимированным изображенями(GIF). В дальнейшем планируется добавить поддержку других форматов.
## Скачать
Последняя версия - https://github.com/broelik/dn-imagetools-ext/releases/tag/0.1
## Пример кода
Чтение GIF:
```php
$decoder = new GifDecoder;
$decoder->read($fileName);
for($i = 0; $i < $decoder->frameCount; $i++)
{
  $image = $decoder->getFrame($i); // UXImage
}
$size = $decoder->frameSize; // [width, height]
$repeatCount = $decoder->loopCount; 
$delay = $decoder->getDelay(0); // 0 - номер кадра
```
Запись GIF:
```php
$encoder = new AnimatedGifEncoder;
$encoder->start($fileName);
$encoder->delay = 100; // задержка в 100 миллисекунд
$encoder->repeat = -1; // Бесконечное повторение
$encoder->size = [100, 100]; // Размер 100x100

$encoder->addFrame($image);
$encoder->addFrame($image2);

$encoder->finish();
```
Пример использования:
https://hub.develnext.org/project/mcVChPVmxAUB
