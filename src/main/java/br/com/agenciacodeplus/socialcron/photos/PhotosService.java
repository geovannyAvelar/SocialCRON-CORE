package br.com.agenciacodeplus.socialcron.photos;

import br.com.agenciacodeplus.socialcron.posts.Post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotosService { 
  
  @Autowired
  private PhotosRepository dao;
  
  public void save(Photo photo) {
    dao.save(photo);
  }
  
  public Photo findOne(Long id) {
    return dao.findOne(id);
  }
  
  public List<Photo> findAll() {
    return dao.findAll();
  }
  
  public List<Photo> findByPost(Post post) {
    return dao.findByPost(post);
  }
  
  public void delete(Long id) {
    dao.delete(id);
  }
  
  public void delete(Photo photo) {
    dao.delete(photo);
  }
  
}
