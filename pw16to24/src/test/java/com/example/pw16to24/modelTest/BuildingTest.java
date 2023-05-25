package com.example.pw16to24.modelTest;

import com.example.pw16to24.models.Building;
import com.example.pw16to24.repositories.BuildingRepository;
import com.example.pw16to24.services.BuildingService;
import com.example.pw16to24.services.EmailService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class BuildingTest {
    @Mock
    private BuildingRepository buildingRepository;

    @Test
    void getBuilding() {
        Building building = new Building();
        building.setId(52L);
        building.setCreationDate("31.01.2020");
        building.setType("house");

        Mockito.when(buildingRepository.findById(52L)).thenReturn(Optional.of(building));
        }

}