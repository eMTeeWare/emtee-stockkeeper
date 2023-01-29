package net.emteeware.emteestockkeeper

import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface ItemTypeRepository : CrudRepository<ItemType, UUID> {
    fun findByGtin(gtin: String): List<ItemType>
}
