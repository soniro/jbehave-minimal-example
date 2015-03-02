package de.soniro.jbehave.minimal.example;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStoryMaps;
import org.jbehave.core.reporters.StoryReporterBuilder;

import java.util.Arrays;
import java.util.List;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import static org.jbehave.core.reporters.Format.*;

public class ExampleStoryMaps extends JUnitStoryMaps {

    public ExampleStoryMaps() {
        configuredEmbedder().useMetaFilters(metaFilters());
    }

    @Override
    protected List<String> metaFilters() {
        return Arrays.asList("+businessDomain1", "+businessDomain2");
    }

    @Override
    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()), "**/*.story", "");
    }

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration().useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(XML, CONSOLE, HTML));
    }
}
