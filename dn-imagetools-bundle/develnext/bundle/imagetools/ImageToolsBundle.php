<?php
namespace develnext\bundle\imagetools;

use ide\bundle\AbstractBundle;
use ide\bundle\AbstractJarBundle;
use ide\project\behaviours\GuiFrameworkProjectBehaviour;
use ide\project\Project;
/**
 * Class JFoenixBundle
 */
class ImageToolsBundle extends AbstractJarBundle
{
    public function isAvailable(Project $project)
    {
        return $project->hasBehaviour(GuiFrameworkProjectBehaviour::class);
    }
}