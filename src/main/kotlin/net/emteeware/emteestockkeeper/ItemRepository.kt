package net.emteeware.emteestockkeeper

import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface ItemRepository: CrudRepository<Item, Int> {
    fun findItemByTypeId(typeId: UUID) : List<Item>
}