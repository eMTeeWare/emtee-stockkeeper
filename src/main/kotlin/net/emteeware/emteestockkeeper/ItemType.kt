package net.emteeware.emteestockkeeper

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.Instant
import java.util.UUID


@Entity
class ItemType(
    @Id
    @Column(nullable = false)
    val id: UUID,
    val description: String,
    val gtin: String,
    val addedOn: Instant
)
