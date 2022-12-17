package com.projects.fifaApplication.respository;


import com.projects.fifaApplication.entity.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerStatisticsRepository extends JpaRepository<PlayerStats,Long> {
    List<PlayerStats> findByGames(int games);
    List<PlayerStats> findByMinutes(int minutes);
    List<PlayerStats> findByGoals(int goals);
    List<PlayerStats> findByBirthYear(int birthYear);




}
