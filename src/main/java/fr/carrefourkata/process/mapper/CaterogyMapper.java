package fr.carrefourkata.process.mapper;

import fr.carrefourkata.dto.CategoryDTO;
import fr.carrefourkata.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CaterogyMapper {

    CaterogyMapper INSTANCE = Mappers.getMapper(CaterogyMapper.class);

    CategoryDTO categoryToCategoryDto(Category category);

    Category categoryDtoToCategory(CategoryDTO categoryDTO);
}
