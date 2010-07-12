package fi.hut.soberit.agilefant.transfer;

import java.util.ArrayList;
import java.util.List;

import fi.hut.soberit.agilefant.model.Product;
import fi.hut.soberit.agilefant.util.BeanCopier;

public class ProductTO extends Product implements LeafStoryContainer {

    private List<StoryTO> leafStories = new ArrayList<StoryTO>();
    private List<ProjectTO> childProjects = new ArrayList<ProjectTO>();
    
    public ProductTO(Product product) {
        BeanCopier.copy(product, this);
    }
    public List<StoryTO> getLeafStories() {
        return leafStories;
    }
    public void setLeafStories(List<StoryTO> leafStories) {
        this.leafStories = leafStories;
    }
    public List<ProjectTO> getChildProjects() {
        return childProjects;
    }
    public void setChildProjects(List<ProjectTO> childProjects) {
        this.childProjects = childProjects;
    }
}
