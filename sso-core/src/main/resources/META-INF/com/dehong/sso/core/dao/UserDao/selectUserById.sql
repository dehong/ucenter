SELECT
  t1.id,
  t1.u_id,
  t1.user_name,
  t1.user_from,
  t1.is_enable status,
  t1.createtime,
  t1.updatetime,
  t2.code,
  t2.name,
  t2.phone,
  t2.dept_name dept
FROM t_user t1,t_user_info t2
where  t1.u_id = t2.id
       AND t1.u_id = /* id */'123'